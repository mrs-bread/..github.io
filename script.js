const planRow = document.getElementById('plan-row');
const businessCard = document.getElementById('business');
const scaleFactor = 1.1;

// Устанавливаем начальный масштаб для центральной карточки
businessCard.style.transform = `scale(${scaleFactor})`;

planRow.addEventListener('mouseover', (event) => {
    if (event.target.classList.contains('plan-card')) {
        if (event.target !== businessCard) {
            businessCard.style.transform = 'scale(1)';
            event.target.style.transform = `scale(${scaleFactor})`;
        }
    }
});

planRow.addEventListener('mouseout', (event) => {
    if(event.relatedTarget === null || !event.relatedTarget.closest('.plan-card')){
        businessCard.style.transform = `scale(${scaleFactor})`;
        Array.from(planRow.querySelectorAll('.plan-card:not(#business)')).forEach(card => {
            card.style.transform = 'scale(1)';
        });
    }
});


