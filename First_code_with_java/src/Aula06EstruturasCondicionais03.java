// link da aula: https://www.youtube.com/watch?v=exxeNsgcg3c&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=22


public class Aula06EstruturasCondicionais03 {
    public static void main(String[] args) {
        // if, else else if
        // idade < 15, categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categorial adulto

        int idade = 21;
        String categoria;

        if (idade < 15){
            // System.out.println("Categoria Infantil! Idade: "+idade);
            categoria = "Categoria Infantil,";
        }else if (idade >= 15 && idade < 18) {
            // System.out.println("Categoria Juvenil! Idade: "+idade);
            categoria = "Categoria Juvenil,";
        }else{
            // System.out.println("Categoria Adulto! Idade: "+idade);
            categoria = "Categoria Adulto,";
        }
        System.out.println(categoria+" Idade = "+idade);
    }
}
