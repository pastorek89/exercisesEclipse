package com.exercises.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
	private final List<ForumUser> theListOfForumUsers = new ArrayList<>();

    public Forum() {
        theListOfForumUsers.add(new ForumUser(1, "Patryk Pastor", 'M', 1989,
                2, 20, 7));
        theListOfForumUsers.add(new ForumUser(2, "Adrian Fatyga", 'M', 1988,
                1, 30, 0));
        theListOfForumUsers.add(new ForumUser(3, "Karolina Pastor", 'F', 1991,
                7, 26, 2));
        theListOfForumUsers.add(new ForumUser(4, "Łukasz Lewandowski", 'M', 1989,
                5, 23, 6));
        theListOfForumUsers.add(new ForumUser(5, "Agata Lewandowska", 'F', 1989,
                2, 18, 63));
        theListOfForumUsers.add(new ForumUser(6, "Piotr Drews", 'M', 1989,
                1, 2, 15));
        theListOfForumUsers.add(new ForumUser(7, "Anna Borek", 'F', 1969,
                1, 31, 8));
        theListOfForumUsers.add(new ForumUser(8, "Patrycja Kumaszka", 'F', 1990,
                4, 20, 12));
        theListOfForumUsers.add(new ForumUser(9, "Paweł Zaklukiewicz", 'M', 1987,
                5, 22, 0));
        theListOfForumUsers.add(new ForumUser(10, "Wojciech Trapczyński", 'M', 1989,
                6, 20, 7));
        theListOfForumUsers.add(new ForumUser(11, "Test Testorowicz", 'M', 1999,
                6, 30, 7));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theListOfForumUsers);
    }
}
