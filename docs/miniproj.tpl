$if(titleblock)$
$titleblock$

$endif$
$for(header-includes)$
$header-includes$

$endfor$
$for(include-before)$
$include-before$

$endfor$
$if(toc)$
$if(toc-title)$
# $toc-title$
$else$
# Table des matières
$endif$

$toc$

$endif$
$body$
$for(include-after)$

$include-after$
$endfor$
