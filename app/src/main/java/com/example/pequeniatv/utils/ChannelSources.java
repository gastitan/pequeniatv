package com.example.pequeniatv.utils;

import com.example.pequeniatv.model.Card;

import java.util.List;
import java.util.Map;

public class ChannelSources {

    public static Map<String, List<Card>> getChannels() {
        return Map.of(
                "Entretenimientos", getEntertainmentChannels(),
                "Noticias", getNewsChannels(),
                "Kids", getCartoonsChannels(),
                "Music", getMusicChannels()
        );
    }

    private static List<Card> getEntertainmentChannels() {
        return List.of(
                //getCard("Telefe", "https://lh3.googleusercontent.com/fU-f0plnzgu8q1N0ePYhoncpOV4i87xselWx93UWClRyQQZPaGJ7Oq7taUUvOUNrnCw=w2400", "https://video-weaver.bue01.hls.ttvnw.net/v1/playlist/CsAF74JzVugpIRdLZnxVmg-bfBza6CsIzegUUGfW_C7_K-9do-B24YPXjv9rpYyUEP1Xi5FUEZf13BXwEYt60zHAudVA4RM4ASveTe-IL31bgXT7t6FA--jHyCJRlZXzHVabmv_KRhPEMLgrPyz9nXL32pzktQlqsHyEZ9Kt_WnQE0Dmk8WhTxyYxWQrGP2riz9o_kc_q37hZomejlbuqQ3QpsnazcVHEYHhGvpuhRo2h8fnyyotEK53mepuRbLZ2VFCXWMhyrcc6ohROhVImwtEqZGI0fH5twoIpU1uUulw3eNQcwjvqHI0APumC9W1_d7MOAyuuzF-a2DOOxR9fhtTew0ZLur4hlGBN-nzDyM_4jj2z4I2-RhPnCqmBuqaxyRUMDHGtBWzHimkrSDY8pqFKwX61iIrH2rT7uFAnKDMXzSAVv_s1AIhCl8j4LoHZb__Hn3Ngmwg8DbLW0lW-x0HcRf2OvlXFDMgdZir227LVHM5WHEj3mWdt3BNxJAkLauM1jiY8OoDYYNVqqURo6kvIF-0g8JLvTr7ZYNeOmufDr5X1--gsP_Ln1do348p0_ZjzbJ88XnAxCtDirdqV5OE6JKWNj5z-rEY_7Ak3IFLKyoYiYvM2nQRjRgHALGApvZBc65zGFUMsNLMePR0Dn4bzGLyLkancbphwz5U1HNC6AX4x-AZ32xfkJUSRij5gJ1crWMQS815I54VIKyZcEych50cZUCOl2hOcq6IRL0JLq-VRKcMqJegiHQMoW0n9V8TLiRcyToLem33ycijKXFMYphHZDQ7x6TGL2hRcMeawvie_q69_eckC8XqSFXwCYpfV4MoTgaFVjv1thRFu8k9RgTv27dBQNJ129bXWAxfPpLrBQ5rCie8rDmwwGEUCBOn7WuwFXSZEtVRD1v8XfENfLW5Qxy6CltTS2iD5xfhpc8aDK9ZLkfrRu-OHMwl9SABKglldS13ZXN0LTIwwgQ.m3u8", "iptv"),
                getCard("Televisión Público", "https://lh3.googleusercontent.com/DnvV0S_FcEzk0hnsaS6QzEeo0sxxqXGhheJ59las4BoGC9OD4uvfQ1EJFPH83N35YfA=w2400", "_h2WLcexSeM", "youtube"),
                getCard("Encuentro", "https://lh4.googleusercontent.com/12nc_uHOMwINq0aXnXfobh8b3t2BZcNLWezEvk8LZPT1uHtbFEWqAHixi9QxYHnzx7A=w2400", "_bHf3KVyhBs", "youtube"),
                getCard("Cinear", "https://lh6.googleusercontent.com/PAkLCUQOgthyR5u28w7pP0uaKX9O1TnpC6F7K8Y9D5LHnbPpgSP7r2yvnQo4AZiYkTg=w2400", "https://5fb24b460df87.streamlock.net/live-cont.ar/cinear/chunklist_w1164886905.m3u8", "iptv"),
                getCard("Mirador", "https://lh3.googleusercontent.com/l7I7r74NQ2miinqv48iJZJk-ZCRR9Ybt5SnT-g0chlE6EmYyNtbZCoJnuZJ4KbTBMzg=w2400", "https://5fb24b460df87.streamlock.net/live-cont.ar/mirador/chunklist_w1549112627.m3u8", "iptv"),
                getCard("Net TV", "https://lh3.googleusercontent.com/B6a73C08L0s4C1rzwxdy3wKni5_pDEUjOG2GLKq5eOQyUPJibks4pRgkd4Zt90EyIZw=w2400", "https://unlimited1-cl-isp.dps.live/nettv/nettv.smil/nettv/livestream1/chunks.m3u8", "iptv"),
                getCard("Gen TV", "https://lh6.googleusercontent.com/G_EzHJA16BmNc2yJBtOu-4EpeLNr3U_kMC46ngG8IghFzXeJAPx4CpW9t2z6JHtMa3w=w2400", "https://inliveserver.com:1936/14056/14056/chunklist_w678854636.m3u8", "iptv"),
                getCard("DeporTV", "https://lh6.googleusercontent.com/tjFRY5fkxqnf-e1rKAZKBl81CB-pChVod1dApnRxNwYXnPUvKatBiLxpF5z216xCgKM=w2400", "Y-DVCmGj8qk", "youtube"),
                getCard("Neo TV", "https://lh6.googleusercontent.com/rNEvHREsZ_Fg_mmYJfWD_7Bdvh-fmOgAx-JdrhaX7kO_AGjWMr7gLD9noIepd2ZoAV4=w2400", "https://videostream.shockmedia.com.ar:19360/neotvdigital/neotvdigital.m3u8?WebM3UCL", "iptv"),
                getCard("Tec TV", "https://lh5.googleusercontent.com/Mro_Ft8HMMiQUUpLJksNevVHqOLYKd0a-yD3bbwN7RFvZKt61U45ok4kXAJzre7yKec=w2400", "https://tv.initium.net.ar:3939/live/tectvmainlive.m3u8", "iptv")
        );
    }

    private static List<Card> getCartoonsChannels() {
        return List.of(
                getCard("PakaPaka", "https://lh3.googleusercontent.com/3P8GCoZDsFKwJYLkT4Sy5Icg5LGpxFS_Ez5jc0jBsGDjZ1eC5jI2V9U8eWQd7SAxdkc=w2400", "7DVbwqx9JnM", "youtube"),
                getCard("Magic Kids", "https://lh6.googleusercontent.com/qPU4z3XHtn2z5opd1PPCAcdfAS6zHpxg0HRrwrD0X4hVE3-HWuiJBfcWkpifQPKjrko=w2400", "https://magicstream.ddns.net/magicstream/stream.m3u8", "iptv"),
                getCard("Latino Kids", "https://lh6.googleusercontent.com/8CMvhR5NAsLnNB3Cr_gVbW9cP_ghCjFvH9OeDShCC4EDtWIuYBzr91ebO7bDxrYK4K8=w2400", "https://videostreaming.cloudserverlatam.com/8062/8062/chunklist_w1017063705.m3u8", "iptv"),
                getCard("El Chavo", "https://lh3.googleusercontent.com/wu_J3-T78btCU1SvLSz70EV89G07fgqVde4-DE8ztW3jFNofsEiJrGpXWCH4Fc2OB9k=w2400", "https://videostreaming.cloudserverlatam.com/ElChavotv/ElChavotv/chunklist_w895523541.m3u8", "iptv"),
                getCard("Simpsons", "https://lh4.googleusercontent.com/WSkEVbdFvb9Bga3UIXcMKrX4xx1NvQ_VcxPjd3YUnl667Pf8_t33rpj6X5cn3QKce-Q=w2400", "https://srv5.zcast.com.br/simpsons/simpsons/chunklist_w1227296552.m3u8", "iptv"),
                getCard("Kids 90", "https://lh6.googleusercontent.com/0SVXSfLxYbGFyjyDn-18O0je9sxMZs2Q4MymiS811OSw9ld9xSvRBy5kGLv87Lww3zo=w2400", "https://videostreaming.cloudserverlatam.com/Kids90/Kids90/chunklist_w1271488169.m3u8", "iptv"),
                getCard("Dreiko TV", "https://lh4.googleusercontent.com/uvptoBGawmyOhvdTP90wle2tQa9u_NDB7qI3dSaFEZqtR-M0RXdD5P6fJYIzuH98H-M=w2400", "https://stmv3.voxtvhd.com.br/dreikotv/dreikotv/playlist.m3u8", "iptv")
        );
    }

    private static List<Card> getNewsChannels() {
        return List.of(
                getCard("TN", "https://lh4.googleusercontent.com/ej1lNxK3Vq8Lkr8N_7YIufdkd6n0RCMqPMTEWF1wSJSjRZwf-rgLptzupWjJIqGzRzM=w2400", "wHn1_QVoXGM", "youtube"),
                getCard("Canal 26", "https://lh6.googleusercontent.com/ywgBrXAjLWeP_pcyoSWpkmohO7CCQQFzApJQey_R7X2hc7sti5vDCI02CBrCfOlH3j4=w2400", "y6Yr-aV6nfM", "youtube"),
                getCard("C5N", "https://lh6.googleusercontent.com/8xDlU_iy7ZBLV5bHJ73pXU9jEKgm5eqkQ9qQ3pvpwmJPiYNXukxpVp7qF57bFZuENKQ=w2400", "jF3jb9JDBr0", "youtube"),
                getCard("IP TV", "https://lh5.googleusercontent.com/8cdaXk6RiLNR21MfAca1AKFG0zZgxFfFsYJHuME30j1yf4yZTkldbhy0WUMScFAD-94=w2400", "9ZjDVnof3zo", "youtube"),
                getCard("Cronica", "https://lh6.googleusercontent.com/xxghzohyAACl45K_6vS3vgIajBZMYWE-d30L8luVjBkI_-hwMlTZOIbylmygk4UkujA=w2400", "InSydaLSSlw", "youtube")
        );
    }

    private static List<Card> getMusicChannels() {
        return List.of(
                getCard("Music Top", "https://lh5.googleusercontent.com/MAiaXu77eHbvdmBsoaNlxb8VE0jiatst6v35s27swDJ8mnnNC9H6ov0vz0FH5FyeO8M=w2400", "https://live-edge01.telecentro.net.ar/live/smil:musictop.smil/chunklist_w1509749651_b2028000_sleng.m3u8", "iptv"),
                getCard("Señal Urbana", "https://lh6.googleusercontent.com/-DI8lTrxQoyduPkeMUwMzFljHgeunOB58OM1HfcZhAUuJc_Xf9VCZNAWmwjca-6LQzU=w2400", "https://fullvideo.enlaweb.com.ar/video95/video95/chunks.m3u8", "iptv"),
                getCard("Panc TV", "https://lh5.googleusercontent.com/98G2g3qwzAlwMMZ9yRheHx6SY9XxvTHSc1GI8WURt0w9hYkJeR4t7tKop58-ssoqGdo=w2400", "https://video.streamtvradio.com:8443/uv096/uv096/chunks.m3u8", "iptv"),
                getCard("Rewind", "https://lh5.googleusercontent.com/yoiT9OxcSoZ4pzimYlgDBeEJNMxeL9Bv6JPrPEg47L1LWd8NJBsF98h4LXUQJHVWH_w=w2400", "https://scl.edge.grupoz.cl/rewindtv/ngrp:live_allhd/chunklist_w1119045271_b461000.m3u8", "iptv"),
                getCard("VM Latino", "https://lh6.googleusercontent.com/Q52ZGaNLTSOeu9uAuRwiMMGD3q4TUBEfemuAzqxuoe4SCVsEdUuh5KjEFNVv0i3lE0E=w2400", "https://59ef525c24caa.streamlock.net/vmtv/vmlatino/chunklist_w1320631755.m3u8", "iptv"),
                getCard("El mundo de la música", "https://lh4.googleusercontent.com/Ka9yoDx35vI62PKakrxCjS-_fguNIjOupKhMi45cYWdiEfmjYdywOIVpHmxgLLoRqNM=w2400", "https://videostreaming.cloudserverlatam.com/8078/8078/chunklist_w1551893986.m3u8", "iptv")
        );
    }
    private static Card getCard(final String name, final String logo, final String channel,
                                final String source) {
        var card = new Card();

        card.setName(name);
        card.setLogo(logo);
        card.setChannel(channel);
        card.setSource(source);

        return card;
    }

}
