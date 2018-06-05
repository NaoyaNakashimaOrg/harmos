DROP TABLE TH0103_PRACTICE_BIBLIOGRAPHY;

CREATE TABLE TH0103_PRACTICE_BIBLIOGRAPHY (
PRACTICE_MNG_NO CHAR(13 CHAR) NOT NULL, 
BIBLIOGRAPHY_NO�@NUMBER(2,0) NOT NULL, 
BIBLIOGRAPHY_NAME VARCHAR2(100 CHAR), 
PUBLISHER  VARCHAR2(20 CHAR), 
VERSION�@NUMBER(9,0) NOT NULL, 
RONRI_SAKUJO_FLG CHAR(1 CHAR) NOT NULL, 
CREATE_DATE DATE NOT NULL, 
CREATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
UPDATE_DATE DATE NOT NULL, 
UPDATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
CONSTRAINT TH0103_PRACTICE_BIBLIOGRAPHY_PK PRIMARY KEY (PRACTICE_MNG_NO,BIBLIOGRAPHY_NO)
);

COMMENT ON TABLE TH0103_PRACTICE_BIBLIOGRAPHY IS '�Q�l����';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.PRACTICE_MNG_NO IS '�T���v���Ǘ��ԍ�';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.BIBLIOGRAPHY_NO IS '�Q�l�����ԍ�';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.BIBLIOGRAPHY_NAME IS '������';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.PUBLISHER IS '�o�Ŏ�';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.VERSION IS '�o�[�W����';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.RONRI_SAKUJO_FLG IS '�_���폜�t���O';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.CREATE_DATE IS '�쐬����';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.CREATE_USER_CD IS '�쐬���[�U�R�[�h';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.UPDATE_DATE IS '�X�V����';
COMMENT ON COLUMN TH0103_PRACTICE_BIBLIOGRAPHY.UPDATE_USER_CD IS '�X�V���[�U�R�[�h';