package com.korit.projectrrs.controller;

import com.korit.projectrrs.common.ApiMappingPattern;
import com.korit.projectrrs.dto.ResponseDto;
import com.korit.projectrrs.dto.Todo.request.TodoPostRequestDto;
import com.korit.projectrrs.dto.Todo.request.TodoUpdateRequestDto;
import com.korit.projectrrs.dto.Todo.response.TodoGetResponseDto;
import com.korit.projectrrs.dto.Todo.response.TodoPostResponseDto;
import com.korit.projectrrs.dto.Todo.response.TodoUpdateResponseDto;
import com.korit.projectrrs.service.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(ApiMappingPattern.TODO)
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;
    private final String TODO_GET = "/sign-up";;

    @PostMapping
    private ResponseEntity<ResponseDto<TodoPostResponseDto>> createTodo(
            @AuthenticationPrincipal String userId,
            @Valid @RequestBody TodoPostRequestDto dto
    ) {
        ResponseDto<TodoPostResponseDto> response = todoService.createTodo(userId, dto);
        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).body(response);
    }

//    @GetMapping
//    private ResponseEntity<ResponseDto<List<TodoGetResponseDto>>> getAllTodoByDay(
//            @AuthenticationPrincipal String userId,
//            @PathVariable LocalDate day
//    ) {
//        ResponseDto<List<TodoGetResponseDto>> response = todoService.getAllTodoByDay(userId, day);
//        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
//        return ResponseEntity.status(status).body(response);
//    }
//
//    @PutMapping
//    private ResponseEntity<ResponseDto<TodoUpdateResponseDto>> updateTodo(
//            @AuthenticationPrincipal String userId,
//            @PathVariable Long todoId,
//            @RequestBody TodoUpdateRequestDto dto
//    ) {
//        ResponseDto<TodoUpdateResponseDto> response = todoService.updateTodo(userId, todoId, dto);
//        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
//        return ResponseEntity.status(status).body(response);
//    }
//
//    @DeleteMapping
//    private ResponseEntity<ResponseDto<Void>> deleteTodo(
//            @AuthenticationPrincipal String userId,
//            @PathVariable Long todoId
//    ) {
//        ResponseDto<Void> response = todoService.deleteTodo(userId, todoId);
//        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
//        return ResponseEntity.status(status).body(response);
//    }
}