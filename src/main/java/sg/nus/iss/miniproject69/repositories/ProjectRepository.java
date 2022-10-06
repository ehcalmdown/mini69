package sg.nus.iss.miniproject69.repositories;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import sg.nus.iss.miniproject69.models.IngredientRecette;

@Repository
public class ProjectRepository {
    
    @Autowired
    @Qualifier("redislab")
    private RedisTemplate<String,String>template; 

    public void saveUser(IngredientRecette iRec, String userName){
        
        //get username, store in redis in id or key form
        String jsonUsername = userName;
        // ValueOperations<String, String> valOps = template.opsForValue(); //might have to swap to list later on
        ListOperations<String, String> listOps = template.opsForList();
        listOps.leftPush(jsonUsername, iRec.toJson().toString()); //to exchange data from web server and then send
    }

    public Optional<List<IngredientRecette>>redisPull(String userName){
        //chuk's empty box rule
        if(!template.hasKey(userName)){
            return Optional.empty();
        }
        List<IngredientRecette>iRecettes = new ArrayList<>();
        // ValueOperations<String, String> valOps = template.opsForValue();
        ListOperations<String, String> listOps = template.opsForList();
        Long size = listOps.size(userName);
        return Optional.of(iRecettes);
    }

    public void redisUpdate(List<IngredientRecette>iRecettes, String userName){
        String jsonUsername = userName;
        // ValueOperations <String, String> valOps = template.opsForValue();
        ListOperations <String, String> listOps = template.opsForList();
        for (int i = 0; i < iRecettes.size(); i++) {
            listOps.leftPush(jsonUsername, iRecettes.get(i).toJson().toString());
        }
    }
}
