import ProfileViewSelector  from "./ProfileviewSelector";
//This UserProfile component just responsible for entering ProfileView it does not care about what type of the user it is that responsibility is deal by ProfileViewSelector component
//Here Ocp Principle applied
const  UserProfile=({user})=>{
    const ProfileView=ProfileViewSelector.getProfileView(user.role);
    return <ProfileView user={user} />
}

export  default  UserProfile;