package org.example.persistent;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(
                new Developer("Alice", Arrays.asList("Java", "Python")),
                new Developer("Bob", Arrays.asList("Java", "C++"))
        );
        //using map
        var programmingLanguages = developers.stream().map(Developer::getProgrammingLanguages).collect(Collectors.toList());
        programmingLanguages.add(List.of("REST"));
        System.out.println("programming languages: " + programmingLanguages+" programming language:"+programmingLanguages.getClass());


        //var abc  = developers.stream().map(Developer::getProgrammingLanguages).flatMap(Collection::stream).distinct().toList();
        var abc = developers.stream().flatMap(developer -> developer.getProgrammingLanguages().stream()).distinct().collect(Collectors.toList());
        System.out.println("abc: " + abc + "abc class:"+abc.getClass());
    }
}


class Developer {
    private String name;
    private List<String> programmingLanguages;
    public Developer(String name, List<String> programmingLanguages) {
        this.name = name;
        this.programmingLanguages = programmingLanguages;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }
    public void setProgrammingLanguages(List<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;

    }

}

