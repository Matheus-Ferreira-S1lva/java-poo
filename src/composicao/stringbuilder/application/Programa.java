package composicao.stringbuilder.application;

import composicao.stringbuilder.entities.Comment;
import composicao.stringbuilder.entities.Post;

public class Programa {
    public static void main(String[] args) {
        Post postado = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        postado.addComment(c1);
        postado.addComment(c2);

        System.out.println(postado.getTitle());
        System.out.println(postado.getContent());
        System.out.println("-------------------");
        System.out.println("Comments:");
        for (Comment comment : postado.getComments()) {
            System.out.println(comment);
        }
    }
}
