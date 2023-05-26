package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    User user1 = new User("aaaa","AAAA","asdasd@asd.com");
    User[] users = new User[]{new User("aaaa","aaaa123","asdasd@asd.com")};
    User user2 = new User(null,"passwordhas#","adads@asd.com");
    User user3 = new User("blabla","aadss123","nevalidenemail");
    User user4 = new User("blabla","   hasSpace","nevalidenemail");

    @Test
    void EveryBranchFunction() {
        assertThrows(RuntimeException.class,()->SILab2.function(null,null));
        assertFalse(()->SILab2.function(user1, Arrays.stream(users).toList()));
        assertTrue(()->SILab2.function(user2, Arrays.stream(users).toList()));
        assertFalse(()->SILab2.function(user3, Arrays.stream(users).toList()));
        assertFalse(()->SILab2.function(user4, Arrays.stream(users).toList()));
    }
    @Test
    void MultipleCondition(){
        assertThrows(RuntimeException.class,()->SILab2.function(new User("adsasd",null,"asdas"),null));
        assertThrows(RuntimeException.class,()->SILab2.function(new User("adsasd","asdasd",null),null));
        assertThrows(RuntimeException.class,()->SILab2.function(null,null));
        assertDoesNotThrow(()->SILab2.function(new User("adsasd","adasd","asdas"),null));
    }
}