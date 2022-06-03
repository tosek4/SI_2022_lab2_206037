# SI_2022_lab2_206037
Тошо Клечкароски, бр. на индекс 206037


Control Flow Graph

![Control Flow Graph](https://user-images.githubusercontent.com/85617305/171952032-6d3955cb-f77d-448b-9e98-9ca58d269ca9.png)

Цикломатска комплексност

Цикломатската комплексност на овој код е 9, истата ја добиваме со броење на предикатните јазли односно јазлите од кои излегува повеќе од едно ребро, исто така може да се добие со броење на регионите. На друг начин би можело со формулата "[број на ребра во графот] - [број на темиња] + 2".

Тест случаи според критериумот Every statement

![EveryStatement](https://user-images.githubusercontent.com/85617305/171952191-3676f06f-cdc8-42f5-a62a-07926df416f8.png)

 void everyStatementTest(){
        //Nodes: 7,8,40
        RuntimeException ex1 = assertThrows(RuntimeException.class, () -> SiLab2.function(new ArrayList<>()));
        assertEquals("List length should be greater than 0", ex1.getMessage());
        //Nodes: 7,10,11,12,13,40
        RuntimeException ex2 = assertThrows(RuntimeException.class, () -> SiLab2.function(Arrays.asList("0","#","0","#", "0")));
        assertEquals("List length should be a perfect square", ex2.getMessage());
        //Nodes: 7,10,11,12,15,16,17,18,19,20,25,26,27,28,29,30,33,32,34,37,40
        List<String> result1  = SiLab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "0", "0"));
        assertEquals("1", result1.get(0));
        assertEquals("2", result1.get(2));
        assertEquals(Arrays.asList("1","#", "2", "0", "2", "#", "0", "0", "1"), result1);
        //Nodes: all
        List<String> result2  = SiLab2.function(Arrays.asList("0", "#", "0", "#", "0", "#", "0", "0", "0"));
        assertEquals("3", result2.get(4));
    }


Тест случаи според критериумот Every path
 
![EveryBranch](https://user-images.githubusercontent.com/85617305/171952202-66fb0027-78b6-4fc5-ac4c-4adcd2b732ba.png)

 void everyBranchTest(){
        //Nodes: 7,8,40
        RuntimeException ex1 = assertThrows(RuntimeException.class, () -> SiLab2.function(new ArrayList<>()));
        assertEquals("List length should be greater than 0", ex1.getMessage());
        //Nodes: 7,10,11,12,13,40
        RuntimeException ex2 = assertThrows(RuntimeException.class, () -> SiLab2.function(Arrays.asList("0","#","0","#", "0")));
        assertEquals("List length should be a perfect square", ex2.getMessage());
        //Nodes: 7,10,11,12,15,16,17,18,19,20,25,26,27,28,29,30,33,32,34,37,40
        List<String> result1  = SiLab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "0", "0"));
        assertEquals("1", result1.get(0));
        assertEquals("2", result1.get(2));
        assertEquals(Arrays.asList("1","#", "2", "0", "2", "#", "0", "0", "1"), result1);
        //Nodes: all
        List<String> result2  = SiLab2.function(Arrays.asList("0", "#", "0", "#", "0", "#", "0", "0", "0"));
        assertEquals("3", result2.get(4));
    }
