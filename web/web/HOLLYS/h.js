$(document).ready(function() {
    $('body header .headerInner .gnb').mouseenter(function() {
        $('body header .headerInner .gnb li span').css({'color':'gray'});
        $('body .gnbBg').slideDown('slow');
    });
    $('body header', 'body .gnbBg').mouseleave(function(){
        $('body header .headerInner .gnb li span').css({'color':'white'});
        $('body .gnbBg').slideUp('slow');
    });
});