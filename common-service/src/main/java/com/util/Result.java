package com.util;

import com.constant.ConstantResult;
import lombok.Data;


/**
 * @Author{作者}jin
 * @Date{更新日期}
 * @ClassExplain:自定义RETURN结果集合
 */
@Data
public class Result<T> implements ConstantResult{

                private Integer code;
                private String msg;
                private T data;

        /**
         * @statement{方法说明}:执行成功信息文本手动写入
         * @param code,msg,data
         * @return:result结果集
         */
        public Result setResult(Integer code, String msg, T data){
            Result result = new Result();
            result.setCode(code);
            result.setMsg(msg);
            if(data!=null) {
                result.setData(data);
            }
            return result;
        }
        /**
         * @statement{方法说明}:执行异常
         * @param
         * @return:result结果集
         */
        public Result setResultError(){
            return setResult(HTTP_REST_CODE_500,HTTP_REST_500_VALUE,null);
        }
        /**
         * @statement{方法说明}:执行成功无数据集合信息
         * @param
         * @return:result结果集
         */
        public Result setResultSuccess(){
            return setResult(HTTP_REST_CODE_200,HTTP_REST_200_VALUE,null);
        }
        /**
         * @statement{方法说明}:执行成功有数据集合信息
         * @param data
         * @return:result结果集
         */
        public Result setResultSuccess(T data){ return setResult(HTTP_REST_CODE_200,HTTP_REST_200_VALUE,data); }
        /**
         * @statement{方法说明}:执行成功信息文本手动写入
         * @param msg
         * @return:result结果集
         */
        public Result setResultMsg(String  msg){ return setResult(HTTP_REST_CODE_200,msg,null); }
        /**
         * @statement{方法说明}:执行成功 状态码,文本 手动写入
         * @param code,msg
         * @return:result结果集
         */
        public Result setResult(Integer code, String msg){
            return setResult(code,msg,null);
        }

}
