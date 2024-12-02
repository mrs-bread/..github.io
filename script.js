const planRow = document.getElementById('plan-row');
const businessCard = document.getElementById('business');
const scaleFactor = 1.1;

// Устанавливаем начальный масштаб для центральной карточки
businessCard.style.transform = `scale(${scaleFactor})`;

planRow.addEventListener('mouseover', (event) => {
    if (event.target.classList.contains('plan-card')) {
        if (event.target !== businessCard) {
            businessCard.style.transform = 'scale(1)'; // Уменьшаем центральную
            event.target.style.transform = `scale(${scaleFactor})`; // Увеличиваем ту, на которую навели
        }
    }
});

planRow.addEventListener('mouseout', () => {
    businessCard.style.transform = `scale(${scaleFactor})`; // Восстанавливаем масштаб центральной
    // Обрабатываем другие карточки
    Array.from(planRow.querySelectorAll('.plan-card:not(#business)')).forEach(card => {
        card.style.transform = 'scale(1)'; // Возвращаем стандартный масштаб
    });
});

