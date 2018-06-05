DROP TABLE TH0003_PASSWORD_HISTORY;

CREATE TABLE TH0003_PASSWORD_HISTORY (
USER_CD CHAR(5 CHAR) NOT NULL, 
USE_FROM DATE NOT NULL, 
PASSWORD VARCHAR2(1000 CHAR) NOT NULL, 
RONRI_SAKUJO_FLG CHAR(1 CHAR) NOT NULL, 
CREATE_DATE DATE NOT NULL, 
CREATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
UPDATE_DATE DATE NOT NULL, 
UPDATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
CONSTRAINT TH0003_PASSWORD_HISTORY_PK PRIMARY KEY (USER_CD,USE_FROM)
);

COMMENT ON TABLE TH0003_PASSWORD_HISTORY IS '�p�X���[�h����';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.USER_CD IS '���[�U�R�[�h';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.USE_FROM IS '�g�p�J�n����';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.PASSWORD IS '�p�X���[�h';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.RONRI_SAKUJO_FLG IS '�_���폜�t���O';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.CREATE_DATE IS '�쐬����';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.CREATE_USER_CD IS '�쐬���[�U�R�[�h';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.UPDATE_DATE IS '�X�V����';
COMMENT ON COLUMN TH0003_PASSWORD_HISTORY.UPDATE_USER_CD IS '�X�V���[�U�R�[�h';