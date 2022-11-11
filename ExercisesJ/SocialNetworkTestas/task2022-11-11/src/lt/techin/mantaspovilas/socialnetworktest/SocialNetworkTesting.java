package lt.techin.mantaspovilas.socialnetworktest;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SocialNetworkTesting extends BaseSocialNetworkTest {


    @Override
    protected SocialNetwork getSocialNetwork() {
        return new SocialNetwork() {

            List<Friend> friends = new ArrayList<>();

            @Override
            public void addFriend(Friend friend) {

                if (friend == null) {
                    throw new IllegalArgumentException();
                }
                if (!(friends.contains(friend))) {
                    friends.add(friend);
                }


            }

            @Override
            public int getNumberOfFriends() {
                return (int) friends.stream().count();
            }

            @Override
            public Friend findFriend(String s, String s1) throws FriendNotFoundException {
                int i = 0;
                if (s == null || s1 == null) {
                    throw new IllegalArgumentException();
                }
                while (i < friends.size()) {
                    if (friends.get(i).getFirstName() == s && friends.get(i).getLastName() == s1) {
                        return friends.get(i);
                    }
                    i++;
                }

                if (!(friends.contains(new Friend(s, s1, "*")))) {
                    throw new FriendNotFoundException(s, s1);
                }
                return null;
            }

            @Override
            public Collection<Friend> findByCity(String s) {
                Collection<Friend> newFriend = new ArrayList<>();
                if (s == null) {
                    throw new IllegalArgumentException();
                }
                for (Friend element : friends) {
                    if (element.getCity().equals(s)) {
                        newFriend.add(element);
                    }
                }
                return newFriend;
            }

            @Override
            public Collection<Friend> getOrderedFriends() {
                return friends.stream()
                        .sorted(Comparator.comparing(Friend::getCity)
                                .thenComparing(Friend::getLastName)
                                .thenComparing(Friend::getFirstName))
                        .collect(Collectors.toList());
            }
        };
    }
}
