# 🍛 우테코 5기 코딩테스트 - 점심 메뉴 추천

우테코 5기 코딩테스트 **점심 메뉴 추천** 은 코딩에 열정을 쏟아버린 나머지 점심 메뉴 고를 기분이 아닌 코치들을 위해 질리지 않도록 점심 메뉴를 추천해주는 프로그램입니다.

코치들의 이름과 먹지 못하는 메뉴를 입력 받아 요일 별로 한 주 동안의 점심 메뉴를 중복 없이 추천해줍니다.

---

## 🔍 목차

- ⚙️ 구현할 기능 목록
- 📋 프로젝트 구조

---

## ⚙️ 구현할 기능 목록

예외 상황이 생기면 `[ERROR]` 로 시작하는 메세지를 출력한 후 다시 입력을 받습니다.

### 1️⃣ 코치 이름 입력 받기

<table>
<tr>
    <th>동작</th>
    <th>예외 상황</th>
</tr>
<tr>
<td><ul>
    <li>
        질문에 해당하는 아래 메세지 출력<br>
        <code>점심 메뉴 추천을 시작합니다.</code><br>
        <code>코치의 이름을 입력해 주세요. (, 로 구분)</code>
    </li>
    <li>코치들의 이름을 입력 받고 검증</li>
</ul></td>
<td><ul>
    <li>
        코치가 2명 이상이 아닐 경우<br>
        <code>[ERROR] 코치는 최소 2명 이상 입력해야 합니다.</code>
    </li>
    <li>
        코치가 5명 이하가 아닐 경우<br>
        <code>[ERROR] 코치는 최대 5명 이하 입력해야 합니다.</code>
    </li>
    <li>
        코치 이름이 2글자 이상 및 4글자 이하가 아닐 경우<br>
        <code>[ERROR] 코치 이름은 2글자 이상 및 4글자 이하 이여야 합니다.</code>
    </li>
</ul></td>
</tr>
</table>

---

## 📋 프로젝트 구조

### 📦 패키지

<table>
    <tr>
        <th>Package</th>
        <th>Class</th>
        <th>Description</th>
    </tr>
    <tr>
        <td rowspan="4">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/constants.svg?sanitize=true"/>
            <b> constant</b>
        </td>
        <td><b>ErrorMessage</b></td>
        <td>예외 상황에 사용 되는 정적 메세지</td>
    </tr>
    <tr>
        <td><b>GeneralMessage</b></td>
        <td>일반 적인 입력 요청 또는 결과 알림에 사용 되는 메세지</td>
    </tr>
    <tr>
        <td><b>Menu</b></td>
        <td>메뉴 이름과 종류에 대한 정보</td>
    </tr>
    <tr>
        <td><b>MenuType</b></td>
        <td>메뉴 정보에 사용 될 메뉴 종류</td>
    </tr>
    <tr>
        <td>
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/controllers.svg?sanitize=true"/>
            <b> controller</b>
        </td>
        <td><b>AdviceController</b></td>
        <td>입력을 받아 계산하고 출력 해주는 전체 진행 담당 컨트롤러</td>
    </tr>
    <tr>
        <td rowspan="2">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/home.svg?sanitize=true"/>
            <b> domain</b>
        </td>
        <td><b></b></td>
        <td></td>
    </tr>
    <tr>
        <td><b></b></td>
        <td></td>
    </tr>
    <tr>
        <td rowspan="2">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/views.svg?sanitize=true"/>
            <b> view</b>
        </td>
        <td><b>InputView</b></td>
        <td>사용자에게 질문을 하고 입력을 받아주는 뷰</td>
    </tr>
    <tr>
        <td><b>OutputView</b></td>
        <td>사용자에게 일반적인 메세지와 결과 및 에외 메세지를 출력해주는 뷰</td>
    </tr>
</table>