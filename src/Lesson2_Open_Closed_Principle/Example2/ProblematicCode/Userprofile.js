const UserProfile = ({ user }) => {
    //if new view is introduced we have to change this component again and again here OCP principle not applied it will be problematic to handle large user base 
    const displayInfo = () => {
        switch (user.role) {
            case 'admin':
                return <AdminView user={user} />;
            case 'editor':
                return <EditorView user={user} />;
            default:
                return <StandardView user={user} />;
        }
    };

    return <div>{displayInfo()}</div>;
};