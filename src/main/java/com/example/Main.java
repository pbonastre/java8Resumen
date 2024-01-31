package com.example;

public static void main(String[] args) {

        System.out.println(changeFormat("please quote  your policy number:112-39-8552."));
        System.out.println(readFirstLine("src/main/resources/prueba.txt"));
        ;
    }

    public static String changeFormat(String paragraph) {

        return Pattern.compile("\\d{3}-\\d{2}-\\d{4}").matcher(paragraph)
                .replaceAll(mr -> mr.group().replaceAll("-", "/"));
    }

    static String readFirstLine(String path){
        BufferedReader file = null;
        String buffer = null;

        try{
            file = new BufferedReader(new FileReader(path));
            buffer = file.readLine();

        }catch (IOException e) {
            System.out.println("CAGADA");
        }finally {
            if(file !=null){
                try{
                    file.close();
                }catch (IOException e){
                    System.out.println("CAGADA");
                }
            }
        }
        return buffer;

    }
}
