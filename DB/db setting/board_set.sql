use enjoy_trip;
SELECT * FROM board;
insert into board values(null,0,now(),'첫번째 글', '첫번째 내용', 1); -- board_type 0 : 공지사항 1 : 게시글?
insert into board values(null,1,now(),'sub test1', 'con test1', 2),(null,1,now(),'sub test2', 'con test2', 2),(null,1,now(),'sub test3', 'con test3', 2),(null,1,now(),'sub test4', 'con test4', 2),(null,1,now(),'sub test5', 'con test5', 2);