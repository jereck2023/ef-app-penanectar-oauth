package pe.edu.cibertec.ef_app_penanectar_oauth.service;

import pe.edu.cibertec.ef_app_penanectar_oauth.model.UserEntity;

public interface IUserService {
    UserEntity obtenerUserXUsername(String username);
}
