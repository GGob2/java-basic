package interface_8.interface_8_4;

public interface Animal {
    public void speak();

    default void findMyFriend(String friendName) {
        System.out.println("Where is " + friendName+ "?") ;
    }
}
