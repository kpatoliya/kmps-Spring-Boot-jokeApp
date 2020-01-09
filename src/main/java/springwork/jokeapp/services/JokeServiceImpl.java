package springwork.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/*** Created by karan patoliya
 on Jan 2020    ***/

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(){
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return null;
    }
}
