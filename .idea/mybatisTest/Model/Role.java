package mybatisTest.model;

public  class  Role{
    private  long id;
    private String roleName;
    private  int age;
    public  long getId(){
        return  id;
    }
    public  void setId(long id){
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}