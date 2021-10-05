# 소스 적용 가이드
## STEP 1. 선행 작업 (로컬 개발 머신 환경)
npm, git

## STEP 2. nuxt 프로젝트 생성 
### `가이드 페이지`
https://nuxtjs.org/docs/get-started/installation

### 옵션 선택:
```bash
Generating Nuxt.js project in client5
? Project name: client5
? Programming language: JavaScript
? Package manager: Npm
? UI framework: Bootstrap Vue
? Nuxt.js modules: Axios - Promise based HTTP client
? Linting tools: ESLint
? Testing framework: Jest
? Rendering mode: Universal (SSR / SSG)
? Deployment target: Server (Node.js hosting)
? Development tools: (Press <space> to select, <a> to toggle all, <i> to invert selection)
? Continuous integration: None
? Version control system: Git
```

### 실행
```bash
npm init nuxt-app <project-name>
```


## STEP 3. plugin 추가 v-calendar : https://vcalendar.io/installation.html
### 이미 작업된 파일 수정 적용됨 (git)
```javascript
  - plugins/vue-calendar.js 추가
    import Vue from 'vue';
    import VCalendar from 'v-calendar';

    // Use v-calendar & v-date-picker components
    Vue.use(VCalendar, {
      componentPrefix: 'vc',
    });
  - nuxt.config.js 수정
    plugins: [
      {src:'~/plugins/vue-calendar.js', mode: 'client'}
    ],
```

### 실행
```bash
  cd <project-name>
  npm install v-calendar
```

## STEP 4. Git 소스 적용
```bash
  git init .
  git remote add origin git@github.com:myeonwoo/mvc.git
  git fetch origin
  git branch -f master origin/master
  git reset .
  git checkout -f
```

## STEP 5. 로컬 개발 서버 실행
```bash
  npm run dev
```

## STEP 6. 개발 시작
  
### 개발 플로
  1. 소스 수정
  2. git push
  3. build & deploy

# APP Structure

## Build Setup

```bash
# install dependencies
$ npm install

# serve with hot reload at localhost:3000
$ npm run dev

# build for production and launch server
$ npm run build
$ npm run start

# generate static project
$ npm run generate
```

For detailed explanation on how things work, check out the [documentation](https://nuxtjs.org).

## Special Directories

You can create the following extra directories, some of which have special behaviors. Only `pages` is required; you can delete them if you don't want to use their functionality.

### `assets`

The assets directory contains your uncompiled assets such as Stylus or Sass files, images, or fonts.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/directory-structure/assets).

### `components`

The components directory contains your Vue.js components. Components make up the different parts of your page and can be reused and imported into your pages, layouts and even other components.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/directory-structure/components).

### `layouts`

Layouts are a great help when you want to change the look and feel of your Nuxt app, whether you want to include a sidebar or have distinct layouts for mobile and desktop.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/directory-structure/layouts).


### `pages`

This directory contains your application views and routes. Nuxt will read all the `*.vue` files inside this directory and setup Vue Router automatically.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/get-started/routing).

### `plugins`

The plugins directory contains JavaScript plugins that you want to run before instantiating the root Vue.js Application. This is the place to add Vue plugins and to inject functions or constants. Every time you need to use `Vue.use()`, you should create a file in `plugins/` and add its path to plugins in `nuxt.config.js`.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/directory-structure/plugins).

### `static`

This directory contains your static files. Each file inside this directory is mapped to `/`.

Example: `/static/robots.txt` is mapped as `/robots.txt`.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/directory-structure/static).

### `store`

This directory contains your Vuex store files. Creating a file in this directory automatically activates Vuex.

More information about the usage of this directory in [the documentation](https://nuxtjs.org/docs/2.x/directory-structure/store).
