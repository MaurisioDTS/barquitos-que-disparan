//SIN ACABAR

CREATE TABLE IF NOT EXISTS usuario
(
    nick varchar(15) NOT NULL,
    passinsha256 char(64) NOT NULL,
    lvl numeric NOT NULL,
    elo integer NOT NULL,
    wins integer,
    loses integer,
    PRIMARY KEY (nick)
);

CREATE TABLE IF NOT EXISTS partida
(
    pid serial NOT NULL,
    player1 varchar(15),
    player2 varchar(15),
    pcomment text,
    duration numeric NOT NULL,
    PRIMARY KEY (pid),
    FOREIGN KEY (player1) REFERENCES usuario(nick),
    FOREIGN KEY (player2) REFERENCES usuario(nick)
    
);
CREATE TABLE IF NOT EXISTS comentario
(
	n serial not null,
	nick varchar(15) not null,
	comentario text not null,
	dat date not null,
	
	PRIMARY KEY (n),
	ADD FOREIGN KEY (nick) REFERENCES usuario (nick)
);

CREATE TABLE IF NOT EXISTS tablero
(
    nick character varying(15) NOT NULL,
    impact character varying(4),
    one character varying(6) NOT NULL,
    two character varying(6) NOT NULL,
    three character varying(6) NOT NULL,
    four character varying(6) NOT NULL,
    five character varying(6) NOT NULL,
    PRIMARY KEY (nick),
    ADD FOREIGN KEY (nick) REFERENCES usuario (nick)
);
