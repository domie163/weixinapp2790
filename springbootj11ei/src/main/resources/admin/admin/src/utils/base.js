const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootj11ei/",
            name: "springbootj11ei",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootj11ei/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "刷题系统"
        } 
    }
}
export default base
