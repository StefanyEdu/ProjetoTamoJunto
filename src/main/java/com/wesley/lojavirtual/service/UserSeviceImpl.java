/*package com.wesley.lojavirtual.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.wesley.lojavirtual.model.User;
import com.wesley.lojavirtual.repository.UserRepository;

@Service
public class UserSeviceImpl  implements UserService{
	
	//Exemplo de service 
	
	private UserRepository userRepository;

    @Autowired
    public UserSeviceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(UUID id) throws DataAccessException {
        Optional<User> user = this.userRepository.findById(id);
            if (user == null){
                return null;
            }
    
            return user.get();
    }

	@Override
	public User findByNickName(String senha) throws DataAccessException {
		
		return null;
	}

	@Override
	public User save(User user) throws DataAccessException {
		
		return null;
	}

	@Override
	public Iterable<User> findAll() throws DataAccessException {
		
		return null;
	}

}
*/

