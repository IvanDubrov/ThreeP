package BD;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;


public class UserDAO {

    private SqlSessionFactory sqlSessionFactory = null;
    public ArrayList<Friend> selectAllFriend;


    public UserDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<User> selectAll() {
        List<User> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            list = session.selectList("OOO.selectAll");
        } finally {
            session.commit();
            session.close();

        }
        return list;

    }



    
    public List<Friend> selectAllFriend() {
        List<Friend> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            list = session.selectList("OOO.selectAllFriend");
        } finally {
            session.commit();
            session.close();
        }
        return list;

    }

    public List<Friend> selectAllFriendForOneUser(int id) {
        List<Friend> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            list = session.selectList("OOO.selectAllFriendForOneUser", id);
        } finally {
            session.commit();
            session.close();
        }
        return list;

    }

    /**
     * Select user from his Phone
     */
    public User selectByPhone(String phone) {
        User user;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            user = session.selectOne("OOO.selectByPhone", phone);
        } finally {
            session.close();
        }
        return user;
    }


    /**
     * Select user from his Name
     */
    public User selectByName(String name) {
        User user;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            user = session.selectOne("OOO.selectByName", name);
        } finally {
            session.close();
        }
        return user;
    }


    /**
     * Select user from yoer id
     */
    public User selectByIdSub(String id) {
        User subdetail;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            subdetail = session.selectOne("OOO.selectById", id);
        } finally {
            session.close();
        }
        return subdetail;
    }


    /**
     * Select user from yoer id
     */
    public Friend selectByIdFriend(int id) {
        Friend friend = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            friend = session.selectOne("OOO.selectByIdFriend", id);
        } finally {
            session.close();
        }
        return friend;
    }


    /**
     * Insert an instance of eee.Person into the database.
     *
     * @param user the instance to be persisted.
     */
    public int insert(User user) {
        int id = -1;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            id = session.insert("OOO.insert", user);
        } finally {
            session.close();
        }
        return id;
    }

    public int insertFriend(Friend friend) {
        int id = -1;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            id = session.insert("OOO.insertFriend", friend);
        } finally {
            session.commit();
            session.close();
        }
        return id;
    }

    /**
     * Update an instance of eee.Person into the database.
     *
     * @param user the instance to be persisted.
     */
    public void update(User user) {
        int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {

            id = session.update("BD.User.update", user);

        } finally {
            session.commit();
            session.close();
        }
    }

    /**
     * Delete an instance of eee.Person from the database.
     *
     * @param id value of the instance to be deleted.
     */
    public void delete(int id) {

        SqlSession session = sqlSessionFactory.openSession();

        try {
            session.delete("OOO.delete", id);
        } finally {
            session.commit();
            session.close();
        }
    }

    /**
     * Delete an instance of eee.Person from the database.
     *
     * @param id value of the instance to be deleted.
     */
    public void deleteFriend(int id) {

        SqlSession session = sqlSessionFactory.openSession();

        try {
            session.delete("OOO.deleteFriend", id);
        } finally {
            session.commit();
            session.close();
        }
    }

    /**
     * Select friend from id
     */
    public Friend selectByIdFriend(String id) {
        Friend friend;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            friend = session.selectOne("OOO.selectByIdFriend", id);
        } finally {
            session.close();
        }
        return friend;
    }


}