PGDMP     &    !                z            jpmodas    14.3    14.3 	    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16394    jpmodas    DATABASE     g   CREATE DATABASE jpmodas WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE jpmodas;
                postgres    false            ?            1259    16396    produto    TABLE     8  CREATE TABLE public.produto (
    codigo_produto integer NOT NULL,
    preco_produto numeric(10,2) NOT NULL,
    quantidade integer NOT NULL,
    nome_produto character varying(50) NOT NULL,
    descricao_produto character varying(80),
    estoqueseguranca integer NOT NULL,
    alerta character varying(200)
);
    DROP TABLE public.produto;
       public         heap    postgres    false            ?            1259    16395    produto_codigo_produto_seq    SEQUENCE     ?   ALTER TABLE public.produto ALTER COLUMN codigo_produto ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.produto_codigo_produto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            ?          0    16396    produto 
   TABLE DATA           ?   COPY public.produto (codigo_produto, preco_produto, quantidade, nome_produto, descricao_produto, estoqueseguranca, alerta) FROM stdin;
    public          postgres    false    210   ?	       ?           0    0    produto_codigo_produto_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.produto_codigo_produto_seq', 140, true);
          public          postgres    false    209            ]           2606    16400    produto produto_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (codigo_produto);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public            postgres    false    210            ?   ?  x??S???0???B?6F?A?r??'?z??)?܀?(h?$?J????$?2??F*??q??n!?	??R??F??"yݙ??QW??O?`?͐?????G`>????J?woW?? ??Q??Ar??2?n???Tr	+?(?? ?ߍR????.*g3t??^??<?Rc=??gҌA^x0?Q??Ķ?O??????M??c<?cns?k?;??v????/C*Cdo͏?$?n??6??
G?i????R???s?zڍ_2?f?+??/K]??_{SKk??v?8:?-?.?3
j??Broܹ??ʳ??bϳ???????>o~?p????\xg??i*!?x@?? ?q3HJӐGi????Ҕ?;?$???}HcM??pQO???!Yxi???W`??7gW??^>p0???????1???? ???:?a?-o#1`_????ɗ?^f?vz?%??????[???"Q'?U?_??j?ڑx     