package com.clara.example;

import clara.rules.QueryResult;
import clara.rules.RuleLoader;
import clara.rules.WorkingMemory;
import com.clara.example.models.ModelA;
import com.clara.example.models.ModelB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        getBs(args).forEach(b -> System.out.println("Found ModelB: " + b.toString()));
    }

    public static List<ModelB> getBs(String[] args) {
        System.out.println("Loading Ruleset");

        WorkingMemory wm = RuleLoader.loadRules("rules.some-ruleset");

        List<ModelA> facts = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            facts.add(new ModelA(i, args[i]));
        }

        Iterable<QueryResult> res = wm.insert(facts).fireRules().query("rules.some-ruleset/get-b");

        List<ModelB> bs = new ArrayList<>();

        res.forEach(r -> bs.add((ModelB) r.getResult("?b")));

        return bs;
    }
}
