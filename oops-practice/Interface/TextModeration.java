public interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}