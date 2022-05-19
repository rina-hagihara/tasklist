<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for="title">タイトル</label>
<input type="text" name="title" value="${tasks.title}">

<label for="content">内容</label>
<input type="text" name="content" value="${tasks.content}">

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">追加</button>