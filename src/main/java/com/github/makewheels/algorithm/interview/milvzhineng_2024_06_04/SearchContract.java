package com.github.makewheels.algorithm.interview.milvzhineng_2024_06_04;

import java.util.*;

public class SearchContract {
    static class Contract {
        String id;
        String content;
    }

    private static List<Contract> getContractList() {
        List<Contract> contractList = new ArrayList<>();

        Contract contract1 = new Contract();
        contract1.id = "c1";
        contract1.content = "c1-abc123";

        Contract contract2 = new Contract();
        contract2.id = "c2";
        contract2.content = "c2-def123";

        contractList.add(contract1);
        contractList.add(contract2);

        return contractList;
    }

    private static Map<Character, Set<String>> loadContractToSearchMap(List<Contract> contractList) {
        Map<Character, Set<String>> map = new HashMap<>();
        for (Contract contract : contractList) {
            String content = contract.content;
            for (int i = 0; i < content.length(); i++) {
                char c = content.charAt(i);
                Set<String> idSet = map.getOrDefault(c, new HashSet<>());
                idSet.add(contract.id);
                map.put(c,idSet);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        List<Contract> contractList = getContractList();
        Map<Character, Set<String>> searchMap = loadContractToSearchMap(contractList);
        char keyword = 'b';
        Set<String> searchResultIdSet = searchMap.get(keyword);
        System.out.println(searchResultIdSet);
    }
}
