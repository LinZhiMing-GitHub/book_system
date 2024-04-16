let heanav = document.querySelector('.heanav')
let heanavmenus = document.querySelectorAll('.heanav-menu')
let heanavmenua = document.querySelectorAll('.heanav-menua')

let menulinka = document.querySelectorAll('.menulinka')

let menumains = document.querySelectorAll('.menumain')
let menumaina = document.querySelectorAll('.menumaina')

let hamburbox = document.querySelector('.heanav-hamburbox')
let alistmain = heanav.querySelector('.heanav-alistmain')

let menulastitem = document.querySelectorAll('.menulastitem')
let menuback = document.querySelectorAll('.menuback')

const hearightitem = document.querySelectorAll('.hearight-item')
const hearightitembox = document.querySelectorAll('.hearight-item-box')

for (let i = 0; i < heanavmenus.length; i++) {
  heanavmenus[i].onmouseover = function () {
    for (let i = 0; i < menumains.length; i++) {
      menumains[i].className = 'menumain opctchange1'
    }
    menumains[i].className = 'menumain opctchange2'
  }
  heanavmenus[i].onmouseout = function () {
    for (let i = 0; i < menumains.length; i++) {
      menumains[i].className = 'menumain opctchange1'
    }
  }
}

for (let i = 0; i< hearightitem.length; i++) {
  hearightitem[i].onmouseover = function () {
    for (let i = 0; i < hearightitembox.length; i++) {
      hearightitembox[i].className = `hearight-item-box opctchange1`
    }
    hearightitembox[i].className = `hearight-item-box opctchange2`
  }
  hearightitem[i].onmouseout = function () {
    for (let i = 0; i < hearightitembox.length; i++) {
      hearightitembox[i].className = `hearight-item-box opctchange1`
    }
  }
}


function stop() {
  var preMove = function (e) {
    passive: false
  }
  document.body.style.overflow = 'hidden'
  document.addEventListener('touchmove', preMove, false) //禁止页面滑动
}
function move() {
  var preMove = function (e) {
    passive: false
  }
  document.body.style.overflow = '' //出现滚动条
  document.removeEventListener('touchmove', preMove, false)
}

let b = 0
hamburbox.onclick = function () {
  if (b == 0) {
    hamburbox.className = 'heanav-hamburbox open'
    heanav.className = 'heanav menu-open'
    alistmain.className = 'heanav-alistmain alistmain2'
    stop()
    b = 1
  } else if (b == 1) {
    hamburbox.className = 'heanav-hamburbox'
    heanav.className = 'heanav'
    alistmain.className = 'heanav-alistmain alistmain1'
    move()
    b = 0
  }
}

for (let i = 0; i < heanavmenua.length; i++) {
  menulinka[i].onclick = function () {
    menulastitem[i].className = 'menulastitem mdxghidden left2'
    menumaina[i].className = 'menumaina opctchange2'
  }
  menuback[i].onclick = function () {
    menulastitem[i].className = 'menulastitem mdxghidden left1'
    menumaina[i].className = 'menumaina opctchange1'
  }
}
