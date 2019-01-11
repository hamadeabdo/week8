package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

    public class KeywordFinder {
        public List<String>findElegant(String sentence){

            return finder(sentence , word -> word.startsWith("ele"));
        }
        public List<String>findPlayful(String sentence){

            return finder(sentence , word -> word.endsWith("ful"));
        }




        public List<String> finder(String sentence, Predicate<String> condition) {
            List<String>output = new ArrayList<>();
            for (String word : sentence.split(" ")){
                if (condition.test(word)){
                    output.add(word);
                }
            }
            return output;
        }

    }
