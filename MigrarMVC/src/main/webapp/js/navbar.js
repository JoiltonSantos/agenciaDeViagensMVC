const menuIcon = document.querySelector('.material-symbols-outlined');
const navbarList = document.querySelector('.navbar-list');

function toggleMenu() {
    navbarList.classList.toggle('open');
    
    if (navbarList.classList.contains('open')) {
        navbarList.style.display = 'block';
    } else {
        navbarList.style.display = 'none';
    }
}

menuIcon.addEventListener('click', toggleMenu);

window.addEventListener('resize', function() {
    if (window.innerWidth > 768) {
        navbarList.classList.remove('open');
        navbarList.style.display = 'flex';
        menuIcon.style.display = 'none';
    } else {
        navbarList.style.display = 'none';
        menuIcon.style.display = 'block';
    }
});
