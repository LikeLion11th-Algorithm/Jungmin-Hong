class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (int i=0; i<db.length; i++){
            // 성공
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer += "login";
                break;
            }
            
            // 비밀번호 오류
            if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                answer += "wrong pw";
                break;
            }
            
            // 실패
            if (i == db.length-1) answer += "fail";
        }
        return answer;
    }
}