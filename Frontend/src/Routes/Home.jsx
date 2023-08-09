import { styled } from "styled-components";
import css from "../font/font.css";
import MainView from "../components/HomeComponent/MainView";
import React, { useState, useEffect, useRef } from "react";
import { motion, AnimatePresence, useAnimation } from "framer-motion";
import { loginState, loginResultState } from ".././recoil/auth";
import { useRecoilState } from 'recoil';
import { accessTokenState } from '.././recoil';
import { useQuery } from "react-query";
import { fetchMain } from "../apis";

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
`;
const Main = styled.img`
  width: 100vw;
  height: 120vh;
`;
const MainWrapper = styled.div`
  margin-top: 40px;
  margin-left: 170px;
  margin-right: 170px;
`;
const ImgText = styled.h2`
  font-family: "Amiri";
  font-size: 40px;
  color: white;
  position: absolute;
  top: 50%;
  left: 40%;
  overflow: hidden;
  animation: fadein 7s ease-in-out;
`;

const DesignerBox = styled.div`
  display: flex;
  justify-content: space-between;
  margin-top: 20px;
  margin-bottom: 20px;
`;
const ProfileBox = styled(motion.div)`
  background-color: #ffffff;
  border: 2px solid orange;
  width: 160px;
  height: 190px;
  border-radius: 0.3rem;
  display: flex;
  flex-direction: column;
  /* justify-content: center; */
  text-align: center;
  align-items: center;
  box-shadow: 0 10px 15px -3px rgb(0 0 0 / 0.1),
    2px 4px 10px -4px rgb(0 0 0 / 0.2);
  object-fit: cover;
  &:hover {
    transform: scale(1.02);
  }
`;
const pofolVariants = {
	nomal: {
		scale: 1,
	},
	hover: {
		scale: 1.05,
		transition: {
			duration: 0.2
		},
	},
}
const Title = styled.h1`
  font-family: "omyu_pretty";
  font-size: 25px;
  font-family: "Blue-road";
  font-weight: bold;
`;
const ImgBox = styled.div`
  width: 80%;
  height: 80%;
  background-color: #fdf8e9;
  border-radius: 0.4rem;
  margin-top: 10px;
  display: flex;
  justify-content: center;
  align-items: center;
  box-shadow: 0 10px 15px -3px rgb(0 0 0 / 0.1),
    2px 4px 10px -4px rgb(0 0 0 / 0.2);
`;
const ProfileImg = styled.img`
  width: 90px;
  height: 90px;
  /* margin-top: 35%; */
  background-color: white;
  border-radius: 50%;
`;
const Name = styled.p`
  /* margin-top: 45%; */
  border: 0;
  background-color: #68655b;
  padding: 5px 15px;
  margin-top: -10px;
  margin-bottom: 10px;
  border-radius: 0.4rem;
  font-size: 13px;
  color: white;
`;

function Home() {
  useEffect(() => {
    const getPersistedAccessToken = () => {
      const persistedData = localStorage.getItem('recoil-persist');
      if (persistedData) {
        const parsedData = JSON.parse(persistedData);
        return parsedData.accessTokenState;
      }
      return null;
    }

    const token = getPersistedAccessToken();
    console.log('Token from localStorage:', token);
  }, []);

  const [loginResult, setLoginResult] = useRecoilState(loginResultState);
  const [token, setToken] = useRecoilState(accessTokenState);
  const { isLoading, data } = useQuery(["noLogInMain"], fetchMain);

  if (isLoading) {
    return <div>Loading...{data}</div>;
  }
  
  return (
    <Wrapper>
      <Main src="/img/banner-lmg.png"></Main>
      <ImgText>Change Hair & U</ImgText>
      <MainWrapper>
      <Title>이주의 인기! Weekly Best Disigner ✨</Title>
      <DesignerBox>
      {/* 이부분 나중에 img로 태그 변경하기 */}
      {data.bestDesigner.map((item)=> (
        <ProfileBox 
          key={item.designerIdx}
          variants={pofolVariants}
					initial="nomal"
					whileHover="hover">
          <ImgBox>
            <ProfileImg src={"/img/opofol9.jpg"}></ProfileImg>
          </ImgBox>
          <Name>{item.name}디자이너</Name>
        </ProfileBox>
      ))
      }
      </DesignerBox>
      </MainWrapper>
      <MainView />
    </Wrapper>
  );
}
export default Home;
