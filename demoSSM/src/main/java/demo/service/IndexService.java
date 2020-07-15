package demo.service;

import demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IndexService {

    @Autowired
    private UserDao userDao;


    public void helloWoridTest(){

        try {
            List<Map<String, String>> maps = userDao.SerletUser();
            for (int i = 0 ; i < maps.size() ; i++){
                Map<String , String> mao = maps.get(i);
                System.out.println(mao.get("usernaem"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("访问了service");
    }
}
