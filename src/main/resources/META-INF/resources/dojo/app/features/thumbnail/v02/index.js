define(['jquery', 'jquery/fancybox/fancybox', 'jquery/fancybox/helpers/buttons',
    'jquery/fancybox/helpers/media', 'jquery/fancybox/helpers/thumbs'], function () {
    var FancyBox = function() {
        $(".fancybox").fancybox({
            groupAttr: 'data-rel',
            prevEffect: 'fade',
            nextEffect: 'fade',
            openEffect  : 'elastic',
            closeEffect  : 'fade',
            closeBtn: true,
            helpers: {
                title: {
                    type: 'float'
                }
            }
        });

        $(".fbox-modal").fancybox({
            maxWidth    : 800,
            maxHeight   : 600,
            fitToView   : false,
            width       : '70%',
            height      : '70%',
            autoSize    : false,
            closeClick  : false,
            closeEffect : 'fade',
            openEffect  : 'elastic'
        });
    };

    return {
        startup: function () {
            FancyBox();
        }
    };
});