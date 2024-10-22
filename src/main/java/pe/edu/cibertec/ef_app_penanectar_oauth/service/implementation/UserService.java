package pe.edu.cibertec.ef_app_penanectar_oauth.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_app_penanectar_oauth.model.UserEntity;
import pe.edu.cibertec.ef_app_penanectar_oauth.repository.UserRepository;
import pe.edu.cibertec.ef_app_penanectar_oauth.service.IUserService;

@RequiredArgsConstructor
@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;
    @Override
    public UserEntity obtenerUserXUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
