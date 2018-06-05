DROP TABLE TH0105_PRACTICE_DOCUMENT;

CREATE TABLE TH0105_PRACTICE_DOCUMENT (
PRACTICE_MNG_NO CHAR(13 CHAR) NOT NULL, 
DOCUMENT_NO�@NUMBER(2,0) NOT NULL, 
DOCUMENT_OVERVIEW VARCHAR2(100 CHAR),
DOCUMENT_NAME VARCHAR2(200 CHAR),
DOCUMENT BLOB,
VERSION�@NUMBER(9,0) NOT NULL, 
RONRI_SAKUJO_FLG CHAR(1 CHAR) NOT NULL, 
CREATE_DATE DATE NOT NULL, 
CREATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
UPDATE_DATE DATE NOT NULL, 
UPDATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
CONSTRAINT TH0105_PRACTICE_DOCUMENT_PK PRIMARY KEY (PRACTICE_MNG_NO,DOCUMENT_NO)
);

COMMENT ON TABLE TH0105_PRACTICE_DOCUMENT IS '';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.PRACTICE_MNG_NO IS '�T���v���Ǘ��ԍ�';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.DOCUMENT_NO IS '�����ԍ�';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.DOCUMENT_OVERVIEW IS '�����T�v';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.DOCUMENT_NAME IS '������';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.DOCUMENT IS '����';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.VERSION IS '�o�[�W����';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.RONRI_SAKUJO_FLG IS '�_���폜�t���O';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.CREATE_DATE IS '�쐬����';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.CREATE_USER_CD IS '�쐬���[�U�R�[�h';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.UPDATE_DATE IS '�X�V����';
COMMENT ON COLUMN TH0105_PRACTICE_DOCUMENT.UPDATE_USER_CD IS '�X�V���[�U�R�[�h';