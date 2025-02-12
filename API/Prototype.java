public class Prototype {
    public void prototype(WebServer webServer) {

        LoginResponse loginResult = webServer.login(new LoginInfo());

        if (loginResult.success()) {

            UserIdentifier userId = loginResult.getUserId();
            LoadProfileResponse profile = webServer.loadProfile(userId);

            if (profile.success()) {
                ChangeProfileResponse changedProfile = webServer.updateProfile(userId,
                        new UpdateProfileRequest());

                LoadProfileResponse updatedProfile = webServer.loadProfile(userId);
                if (updatedProfile.success()) {
                }
            }
            webServer.logout(userId);
        }
    }

}
