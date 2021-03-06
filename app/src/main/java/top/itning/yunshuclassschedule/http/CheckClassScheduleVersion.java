package top.itning.yunshuclassschedule.http;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 课程表信息版本检查
 *
 * @author itning
 */
public interface CheckClassScheduleVersion {
    /**
     * 检查课程表版本
     *
     * @param classId 课程ID
     * @return String
     */
    @GET("classSchedule/checkVersion")
    Call<String> checkVersion(@Query("classId") String classId);
}
