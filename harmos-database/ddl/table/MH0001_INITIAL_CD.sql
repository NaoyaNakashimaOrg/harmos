DROP TABLE MH0001_INITIAL_CD;

CREATE TABLE MH0001_INITIAL_CD (
BUNRUI_CD VARCHAR2(5 CHAR) NOT NULL, 
BUNRUI_NAME VARCHAR2(1000 CHAR), 
KUBUN_CD VARCHAR2(5 CHAR) NOT NULL, 
KUBUN_NAME VARCHAR2(1000 CHAR), 
KUBUN_BETSU_NAME1 VARCHAR2(1000 CHAR), 
KUBUN_BETSU_NAME2 VARCHAR2(1000 CHAR), 
KUBUN_BETSU_NAME3 VARCHAR2(1000 CHAR), 
PARENT_CD CHAR(5 CHAR), 
CONSTANT_NAME VARCHAR2(1000 CHAR) NOT NULL UNIQUE,
RONRI_SAKUJO_FLG CHAR(1 CHAR) NOT NULL, 
CREATE_DATE DATE NOT NULL, 
CREATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
UPDATE_DATE DATE NOT NULL, 
UPDATE_USER_CD VARCHAR2(50 CHAR) NOT NULL, 
CONSTRAINT MH0001_INITIAL_CD_PK PRIMARY KEY (BUNRUI_CD, KUBUN_CODE)
);

COMMENT ON TABLE MH0001_INITIAL_CD IS '�����R�[�h�}�X�^';
COMMENT ON COLUMN MH0001_INITIAL_CD.BUNRUI_CD IS '���ރR�[�h';
COMMENT ON COLUMN MH0001_INITIAL_CD.BUNRUI_NAME IS '���ޖ�';
COMMENT ON COLUMN MH0001_INITIAL_CD.KUBUN_CD IS '�敪�R�[�h';
COMMENT ON COLUMN MH0001_INITIAL_CD.KUBUN_NAME IS '�敪��';
COMMENT ON COLUMN MH0001_INITIAL_CD.KUBUN_BETSU_NAME1 IS '�敪�ʖ��P';
COMMENT ON COLUMN MH0001_INITIAL_CD.KUBUN_BETSU_NAME2 IS '�敪�ʖ��Q';
COMMENT ON COLUMN MH0001_INITIAL_CD.KUBUN_BETSU_NAME3 IS '�敪�ʖ��R';
COMMENT ON COLUMN MH0001_INITIAL_CD.PARENT_CD IS '�e�R�[�h';
COMMENT ON COLUMN MH0001_INITIAL_CD.CONSTANT_NAME IS '�萔��';
COMMENT ON COLUMN MH0001_INITIAL_CD.RONRI_SAKUJO_FLG IS '�_���폜�t���O';
COMMENT ON COLUMN MH0001_INITIAL_CD.CREATE_DATE IS '�쐬����';
COMMENT ON COLUMN MH0001_INITIAL_CD.CREATE_USER_CD IS '�쐬���[�U�R�[�h';
COMMENT ON COLUMN MH0001_INITIAL_CD.UPDATE_DATE IS '�X�V����';
COMMENT ON COLUMN MH0001_INITIAL_CD.UPDATE_USER_CD IS '�X�V���[�U�R�[�h';