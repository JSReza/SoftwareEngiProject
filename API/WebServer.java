public interface WebServer {
    LoginResponse login(LoginInfo loginInfo);

    LoadProfileResponse loadProfile(UserIdentifier userId);

    ChangeProfileResponse updateProfile(UserIdentifier userId,
            UpdateProfileRequest updateProfileRequest);

    LogoutResponse logout(UserIdentifier userId);

}
