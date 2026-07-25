const ProfileViewSelector={
    getProfileView(role){
        switch (role){
            case 'admin': return <AdminView />
            case 'editor':return <EditorView />
            default: return <StandView />
        }
    }
}

export default ProfileViewSelector; 