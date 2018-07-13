package com.ponder.closer.orm.mapper;

import java.util.List;
import com.ponder.closer.orm.bean.User;

public interface UserMapper {
	/**
     * �����Ñ�
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(User user) throws Exception;
    /**
     * �޸��Ñ�
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    public int updateUser (User user,int id) throws Exception;
     /**
      * �h���Ñ�
      * @param id
      * @return
      * @throws Exception
      */
    public int deleteUser(int id) throws Exception;
    /**
     * ����id��ѯ�û���Ϣ
     * @param id
     * @return
     * @throws Exception
     */
    public User selectUserById(int id) throws Exception;
     /**
      * ��ѯ���е��û���Ϣ
      * @return
      * @throws Exception
      */
    public List<User> selectAllUser() throws Exception;
}
