
function handleclick(counter,item){
    // カウント数を取得
    counter.textContent=parseInt(counter.textContent)+1;
    // 合計カウント数を取得
    totalCount.textContent=parseInt(totalCount.textContent)+1;
    // 合計金額を取得
    totalPrice.textContent=parseInt(totalPrice.textContent)+prices[item];
}

const prices ={
    coffee: 480,
    tea: 280,  
    milk:180,
    coke:190,
    beer:590 
}

const totalCount = document.getElementById("count");
const totalPrice = document.getElementById('price');

// 各商品のボタンにイベントリスナーを追加
for(const item in prices){
    const button = document.getElementById(item);
    const counter = document.getElementById(`${item}-count`);
    button.addEventListener("click",()=>handleclick(counter,item));
}




