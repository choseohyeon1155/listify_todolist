CREATE TABLE `member` (
    `id` VARCHAR(100) NOT NULL,
    `username` VARCHAR(100) NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `password` VARCHAR(100) NOT NULL,
    `phone` VARCHAR(20) NOT NULL,
    `member_number` INT NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `address` VARCHAR(300) NOT NULL,
    `birthday` DATE NOT NULL,
    `create_date` DATE NULL,
    `update_date` DATE NULL,
    `role` VARCHAR(30) NULL,
    `member_state` CHAR(5) NULL COMMENT '정상 : A
탈퇴: D
휴먼:B',
    PRIMARY KEY (`id`)
);




------------------------------------------------------

--db 테이블명 전체 조회
SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'listify';

--테이블 조회
select * from member;

--테이블 삭제
drop table member;