## 기초 관련

### BasicApplication
- Spring Boot 어플리케이션 시작

### BasicController
- 기본 HTTP 메서드 처리

### RequestDataController
- 데이터 수집 및 유효성 검사


## DTO (Data Transfer Object) 관련

### Lombok
- 회원가입 정보 전달

### Validation
- 클라이언트가 전송하는 데이터의 유효성 검사


## API 요청 & 응답 관련

### Cors

### CorsConfig

### ServiceController

### CustomExceptionHandler

### BasicService

### BasicServiceImplement


## DB 생성 & 보관 관련

### UserController
- 클라이언트 요청 처리 & 서비스 호출
- 메서드 요청 처리 : POST, GET, PATCH, DELETE

### GetMapping

### PostUserRequestDto
- 사용자가 회원가입(POST) 시 보낼 요청 데이터를 검증
- 주요 필드 : userId, userPassword, userName, userAddress, userTelNumber
- 유효성 검사 @NotBlank(공백 유무), @Pattern(필수 입력 문자), @Length(길이 제한)

### GetUserResponseDto
- 특정 사용자 조회(GET) 시 조회 결과를 반환
- 주요 필드 : userId, userName, userAddress

### GetUserListResponseDto
- 여러 사용자의 목록 조회(GETLIST) 시 조회 결과를 리스트 형식으로 반환
- 주요 필드 : userList

### PatchUserRequestDto
- 용자가 정보 수정 요청 시 보낼 데이터의 유효성 검사를 담당
- 주요 필드 : userName, userAddress
- 유효성 검사 : @NotBlank(공백 유무), @Length(길이 제한)

### ResponseDto
- API 응답을 표준화된 형식으로 반환한 후 클라이언트에게 응답을 전달한 뒤 성공 or 오류 메세지 출력
- 응답 메세지 : success, databaseError, duplicatedId, duplicatedTelNumber, noExistUser

### UserEntity
- @Entity 어노테이션을 사용해 DB 테이블과 매핑 후 UserRepository에서 데이터 저장 or 조회
- 필드 : 사용자 ID, 비밀번호, 이름, 주소, 전화번호

### UserRepository
- 데이터베이스의 상호작용 담당. JPA나 SpringData를 이용해 CRUD 작업 수행
- 제공 메서드 : findByUserId(), existByUserId(), save(), deleteById()

### UserService
- 비즈니스 로직 담당 & 작업에 필요한 메서드의 시그니처 정의
- 메서드 정의 : 사용자 생성(POST), 특정 사용자 조회(GET), 사용자 목록 조회(GETLIST), 사용자 정보 수정(PATCH), 사용자 정보 삭제(DELETE)

### UserServiceImplement
- UserService 인터페이스 상속 후 실제 비즈니스 로직 구현
- 제공 메서드 : 사용자 정보 중복 검사, 사용자 정보 저장, 사용자 정보 조회, 사용자 정보 수정, 사용자 정보 삭제

### User


## 보안 관련

### WebSecurityConfig

### SecurityController

### RequestDataController

### SignUpRequestDto

### SignInRequestDto

### JwtAuthenticationFilter

### JwtProvider
- JWT(Json Web Token)의 생성 및 검증 기능 제공
- 주요 기능 : create(JWT 생성), validate(JWT 검증), @Value(비밀 키 가져옴)

### SecurityService

### SecurityServiceImplement


## OAuth2 관련

### CustomOAuth2User

### OAuth2UserServiceImplement

### OAuth2SuccessHandler



/basic **
/security ** 모두 허용

/request-data/request-param 인증된 사용자만 허용

인증 절차 -> JWT 발행 -> /request-data/request-param 요청
Header에 Authorizatio 필드 값으로 Bearer JWT를 포함하여 전송